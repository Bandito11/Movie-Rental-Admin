/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom;

/**
 *
 * @author Esteban Morales
 * Este es un esquema de la data utilizada en la base de datos
 */
 public class Person {
     private int _Id;
     private String _firstName;
     private String _lastName;
     private String _address;
     private String _city;
     private String _zipCode;
     private String _phone;
     private String _userName;
     private String _password;
     private String _birthDate;
     
    /**
     * @return the _Id
     */
    public int getId() {
        return _Id;
    }

    /**
     * @param _Id the _Id to set
     */
    public void setId(int _Id) {
        this._Id = _Id;
    }

    /**
     * @return the _firstName
     */
    public String getFirstName() {
        return _firstName;
    }

    /**
     * @param _firstName the _firstName to set
     */
    public void setFirstName(String _firstName) {
        this._firstName = _firstName;
    }

    /**
     * @return the _lastName
     */
    public String getLastName() {
        return _lastName;
    }

    /**
     * @param _lastName the _lastName to set
     */
    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    /**
     * @return the _address
     */
    public String getAddress() {
        return _address;
    }

    /**
     * @param _address the _address to set
     */
    public void setAddress(String _address) {
        this._address = _address;
    }

    /**
     * @return the _city
     */
    public String getCity() {
        return _city;
    }

    /**
     * @param _city the _city to set
     */
    public void setCity(String _city) {
        this._city = _city;
    }

    /**
     * @return the _zipCode
     */
    public String getZipCode() {
        return _zipCode;
    }

    /**
     * @param _zipCode the _zipCode to set
     */
    public void setZipCode(String _zipCode) {
        this._zipCode = _zipCode;
    }

    /**
     * @return the _phone
     */
    public String getPhone() {
        return _phone;
    }

    /**
     * @param _phone the _phone to set
     */
    public void setPhone(String _phone) {
        this._phone = _phone;
    }  

    /**
     * @return the _userName
     */
    public String getUserName() {
        return _userName;
    }

    /**
     * @param _userName the _userName to set
     */
    public void setUserName(String _userName) {
        this._userName = _userName;
    }

    /**
     * @return the _password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * @param _password the _password to set
     */
    public void setPassword(String _password) {
        this._password = _password;
    }

    /**
     * @return the _birthDate
     */
    public String getBirthDate() {
        return _birthDate;
    }

    /**
     * @param _birthDate the _birthDate to set
     */
    public void setBirthDate(String _birthDate) {
        this._birthDate = _birthDate;
    }
}
