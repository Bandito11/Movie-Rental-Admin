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
public class RentalSchema {
    private int _moviesId;
    private int _customersId;
    private Boolean _rented;
    private String _rentedOn;
    private String _returnedOn;
    private String _customersName;
    private String _title;

    /**
     * @return the _moviesId
     */
    public int getMoviesId() {
        return _moviesId;
    }

    /**
     * @param _moviesId the _moviesId to set
     */
    public void setMoviesId(int _moviesId) {
        this._moviesId = _moviesId;
    }

    /**
     * @return the _customersId
     */
    public int getCustomersId() {
        return _customersId;
    }

    /**
     * @param _customersId the _customersId to set
     */
    public void setCustomersId(int _customersId) {
        this._customersId = _customersId;
    }

    /**
     * @return the _rented
     */
    public Boolean getRented() {
        return _rented;
    }

    /**
     * @param _rented the _rented to set
     */
    public void setRented(Boolean _rented) {
        this._rented = _rented;
    }

    /**
     * @return the _rentedOn
     */
    public String getRentedOn() {
        return _rentedOn;
    }

    /**
     * @param _rentedOn the _rentedOn to set
     */
    public void setRentedOn(String _rentedOn) {
        this._rentedOn = _rentedOn;
    }

    /**
     * @return the _returnedOn
     */
    public String getReturnedOn() {
        return _returnedOn;
    }

    /**
     * @param _returnedOn the _returnedOn to set
     */
    public void setReturnedOn(String _returnedOn) {
        this._returnedOn = _returnedOn;
    }

    /**
     * @return the _customersName
     */
    public String getCustomersName() {
        return _customersName;
    }

    /**
     * @param _customersName the _customersName to set
     */
    public void setCustomersName(String _customersName) {
        this._customersName = _customersName;
    }

    /**
     * @return the _title
     */
    public String getTitle() {
        return _title;
    }

    /**
     * @param _title the _title to set
     */
    public void setTitle(String _title) {
        this._title = _title;
    }
    
}
