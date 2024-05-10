/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arduino.component#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arduino.component#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getcomponent()
 * @model
 * @generated
 */
public interface component extends EObject
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' reference.
   * @see #setComponents(components)
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getcomponent_Components()
   * @model
   * @generated
   */
  components getComponents();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arduino.component#getComponents <em>Components</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Components</em>' reference.
   * @see #getComponents()
   * @generated
   */
  void setComponents(components value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getcomponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arduino.component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // component
