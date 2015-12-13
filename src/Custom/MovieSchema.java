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

public class MovieSchema {
    private int _Id;
    private String _title;
    private String _releaseDate;
    private String _genre;
    private String _runTime;
    private String _rated;
    private String _image;
    private Boolean _dvd;
    private Boolean _bluRay;
    
    private String _writerFirstName;
    private String _writerLastName;
    
    private String _directorFirstName;
    private String _directorLastName;
    
    private String _artistFirstName;
    private String _artistLastName;

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

    /**
     * @return the _releaseDate
     */
    public String getReleaseDate() {
        return _releaseDate;
    }

    /**
     * @param _releaseDate the _releaseDate to set
     */
    public void setReleaseDate(String _releaseDate) {
        this._releaseDate = _releaseDate;
    }

    /**
     * @return the _genre
     */
    public String getGenre() {
        return _genre;
    }

    /**
     * @param _genre the _genre to set
     */
    public void setGenre(String _genre) {
        this._genre = _genre;
    }

    /**
     * @return the _runTime
     */
    public String getRunTime() {
        return _runTime;
    }

    /**
     * @param _runTime the _runTime to set
     */
    public void setRunTime(String _runTime) {
        this._runTime = _runTime;
    }

    /**
     * @return the _rated
     */
    public String getRated() {
        return _rated;
    }

    /**
     * @param _rated the _rated to set
     */
    public void setRated(String _rated) {
        this._rated = _rated;
    }

    /**
     * @return the _image
     */
    public String getImage() {
        return _image;
    }

    /**
     * @param _image the _image to set
     */
    public void setImage(String _image) {
        this._image = _image;
    }

    /**
     * @return the _writerFirstName
     */
    public String getWriterFirstName() {
        return _writerFirstName;
    }

    /**
     * @param _writerFirstName the _writerFirstName to set
     */
    public void setWriterFirstName(String _writerFirstName) {
        this._writerFirstName = _writerFirstName;
    }

    /**
     * @return the _writerLastName
     */
    public String getWriterLastName() {
        return _writerLastName;
    }

    /**
     * @param _writerLastName the _writerLastName to set
     */
    public void setWriterLastName(String _writerLastName) {
        this._writerLastName = _writerLastName;
    }

    /**
     * @return the _directorFirstName
     */
    public String getDirectorFirstName() {
        return _directorFirstName;
    }

    /**
     * @param _directorFirstName the _directorFirstName to set
     */
    public void setDirectorFirstName(String _directorFirstName) {
        this._directorFirstName = _directorFirstName;
    }

    /**
     * @return the _directorLastName
     */
    public String getDirectorLastName() {
        return _directorLastName;
    }

    /**
     * @param _directorLastName the _directorLastName to set
     */
    public void setDirectorLastName(String _directorLastName) {
        this._directorLastName = _directorLastName;
    }

    /**
     * @return the _artistFirstName
     */
    public String getArtistFirstName() {
        return _artistFirstName;
    }

    /**
     * @param _artistFirstName the _artistFirstName to set
     */
    public void setArtistFirstName(String _artistFirstName) {
        this._artistFirstName = _artistFirstName;
    }

    /**
     * @return the _artistLastName
     */
    public String getArtistLastName() {
        return _artistLastName;
    }

    /**
     * @param _artistLastName the _artistLastName to set
     */
    public void setArtistLastName(String _artistLastName) {
        this._artistLastName = _artistLastName;
    }    

    /**
     * @return the _dvd
     */
    public Boolean getDvd() {
        return _dvd;
    }

    /**
     * @param _dvd the _dvd to set
     */
    public void setDvd(Boolean _dvd) {
        this._dvd = _dvd;
    }

    /**
     * @return the _bluRay
     */
    public Boolean getBluRay() {
        return _bluRay;
    }

    /**
     * @param _bluRay the _bluRay to set
     */
    public void setBluRay(Boolean _bluRay) {
        this._bluRay = _bluRay;
    }
}
