/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arduino.Model#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arduino.Model#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arduino.Model#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.arduino.components}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getModel_Components()
   * @model containment="true"
   * @generated
   */
  EList<components> getComponents();

  /**
   * Returns the value of the '<em><b>Connection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' containment reference.
   * @see #setConnection(connection)
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getModel_Connection()
   * @model containment="true"
   * @generated
   */
  connection getConnection();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arduino.Model#getConnection <em>Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection</em>' containment reference.
   * @see #getConnection()
   * @generated
   */
  void setConnection(connection value);

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' containment reference.
   * @see #setBehavior(behavior)
   * @see org.xtext.example.mydsl.arduino.ArduinoPackage#getModel_Behavior()
   * @model containment="true"
   * @generated
   */
  behavior getBehavior();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arduino.Model#getBehavior <em>Behavior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior</em>' containment reference.
   * @see #getBehavior()
   * @generated
   */
  void setBehavior(behavior value);

} // Model
