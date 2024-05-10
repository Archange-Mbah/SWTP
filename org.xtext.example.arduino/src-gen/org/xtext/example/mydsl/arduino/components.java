/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arduino.components#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arduino.components#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arduino.components#getComponent_state <em>Component state</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getcomponents()
 * @model
 * @generated
 */
public interface components extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getcomponents_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arduino.components#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Connectors</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connectors</em>' attribute list.
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getcomponents_Connectors()
   * @model unique="false"
   * @generated
   */
  EList<String> getConnectors();

  /**
   * Returns the value of the '<em><b>Component state</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.arduino.component_state}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component state</em>' containment reference list.
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getcomponents_Component_state()
   * @model containment="true"
   * @generated
   */
  EList<component_state> getComponent_state();

} // components
