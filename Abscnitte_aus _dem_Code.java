/*part 1
-die Hauptmethode zur Generierung  von Code
-Bearbeitet die Behaviors
- Behavioir besteht aus  Alternative und messages.
- wenn das objekt eine Instanz von message ist dann ruften wir  compile(message message); 
-wenn das objekt eine Instanz von  alternative ist dann ruft er compile2(alternative alternative);
*/
def String compileBehavior(behavior behavior1) {

		var String ret = "void loop () { \n";
		
		for (element element1 : behavior1.getElements()) {
			if (element1 instanceof message) ret+=compile((element1 as message)) + "";
			if(element1 instanceof alternative) ret+=compile2(element1 as alternative);
      }
      
   ret += "\n }";
	
return ret;
}


/*part 2 compile
- Bearbeitet messages
- Such zuerst nach der Name der Operation und speichert das in einem String
- laüft durch die  Parameterliste, wenn es um ein komponent geht, 
  laüft er durch die  Liste der Verdrahtungen  und üperprüft ob dieser Komponent in einer Verdrahtungen zu finden ist.
  wenn ja wird überprüft, ob es um Digital_out  und digitalWrite geht.
- wenn ja wird der Name des ports in der String hinzugefügt.
-wenn es um eine Konstante geht, haben wir folgendes
(0 -> LOW) und (1->HIGH)
*/
def String compile(message element1){
		var ret="";
		if (element1 instanceof message) {
				ret += (element1 as message).getMethod().getOpeation().getName().toString + "(";
				var par = (element1 as message).getMethod().getParameter_list().size;
			
			var currentIndex = 0;

			for (parameter param : (element1 as message).getMethod().getParameter_list()) {
				if (param.getConstant() !== null) {

					if (param.getConstant().equals("0")) {
						ret += "LOW";
					} else if (param.getConstant().equals("1")) {
						ret += "HIGH";
					} else
						ret += param.getConstant();
				}
				if (param.getComponent() !== null) {
					// ret+= param.getComponent();
					for (wiring wire1 : connection_list.getWiring()) {
						   if ((wire1.getSrc_port().getName().equals("DIGITAL_OUT")) &&
							(element1 as message).getMethod().getOpeation().getName().toString.equals("digitalWrite")	&& 
							(wire1.getSrc().getName().equals(param.getComponent().getName()))) 
							{
								ret += wire1.getTar_port().getName();
							}
							else if ((wire1.getSrc_port().getName().equals("DIGITAL_OUT")) &&
							(element1 as message).getMethod().getOpeation().getName().toString.equals("tone")	&& 
							(wire1.getSrc().getName().equals(param.getComponent().getName()))) 
							{
								ret += wire1.getTar_port().getName();
							}
							
							else if (wire1.getTar_port().getName().equals("DIGITAL_OUT") &&(
								(element1 as message).getMethod().getOpeation().getName().toString.equals(
									"digitalWrite")) && (wire1.getTar().getName().equals(param.getComponent().getName()))
									) 
									{
								ret += wire1.getSrc_port().getName();
							}
							else  if( wire1.getTar_port().getName().equals("DIGITAL_OUT") &&((element1 as message).getMethod().getOpeation().getName().toString.equals(
									"tone"))
							 &&(wire1.getTar().getName().equals(param.getComponent().getName())))
									{
									ret += wire1.getSrc_port().getName();
						}
					}
				} // else if(param.get)
				else {
					ret += "";
				}
				currentIndex = currentIndex + 1;
				if (currentIndex < par) {
					ret += ",";
				}
			}
			ret += ");  \n";
		}
		
	
	return ret;
	}

/*part 3 compile 2
-bearbeitet alternative
-Alternativen bestehen aus Conditions und elements(messages oder alternativen)
- Wir greifen auf die methode in  conditions zu und schreiben den methoden Namen, falls es eine alternative ist.
-dannach laufen wir durch die Parameterliste und Überprüfen ob der Koomponent sich in den Wirings befindet:
 wenn ja überprüfen wir ob es um einen digital_in geht: 
 ZB
 alt
    void digitalRead BUTTONs4==HIGH{
    Buzzer-> Arduino: void tone  BUZZER 2000
    }
   else {
   	 Buzzer-> Arduino: void noTone  2000
   }

-aber wenn es message ist rufen wir compile(message);
*/

def String compile2(alternative element1){
		 var ret="";
		 ret+= 'if  ('; 
		 //ret+= element1.getCondition().eContents();
		 for(EObject ob: element1.getCondition().eContents()){ // we get it's contents
		 	if(ob instanceof operation_name ) ret+= (ob as operation_name).getName() + "(";
		}
		 	for(parameter p: (element1.getCondition() as method).parameter_list){ // we get the parameters of the alternative and try to get the corresponding ports through the wirings
		 	for (wiring wire1 : connection_list.getWiring()) {
				if(p.getComponent().equals(wire1.getSrc()) && wire1.getSrc_port().getName().equals("DIGITAL_IN")) ret+= wire1.getTar_port();
				if(p.getComponent().equals(wire1.getTar())&&  wire1.getTar_port().getName().equals("DIGITAL_IN") ) ret+=wire1.getSrc_port();	   
	}
		 
		 		
		 }
		 ret+=")";
		 
		 ret+= "== " + (element1.getCondition() as method).boolValue;
		 
		 ret+= ') { \n';  /*the part of the boolean expression is done */
		  var count=0;
		  for(element element2:element1.getElements()){
		  	
		  	if(element2 instanceof message){
		  		 ret+=compile(element2 as message) + " }";
		  		 if(count< element1.getElements().size-1) ret+=" \n else { \n "; 
		  		}
		  	  else if(element2 instanceof alternative){
		  		ret+=compile2(element1 as alternative);
		  	 }
		  	 count++;
		  	}
		  
		 return ret;
		
	}
	

/*Herausforderung
-Match zwischen Komponenten und Wiring
-Kommas und parameters
-Alternativen und messages
*/
		
