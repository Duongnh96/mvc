package model;

/**
 * @description:.
 * @author User
 * @create:Dec 4, 2017
 * @modifier:User
 */
public class User {
  /**
   *
   */
  private String firstName;

  /**
   * @description:
   * @author User
   * @create:Dec 4, 2017
   * @modifier:User
   * @modifined date :Dec 4, 2017
   * @exeption:
   * @param firstName
   * @param lastName
   * @param phone
   * @param desCaption
   * @param image
   * @param gender
   * @param vehicle
   * @param option
   */
  public User(String firstName, String lastName, String phone, String desCaption, String image, String gender,
      String vehicle, String option) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.desCaption = desCaption;
    this.image = image;
    this.gender = gender;
    this.vehicle = vehicle;
    this.option = option;
  }
  /**
   * @description:
   * @author User
   * @create:Dec 4, 2017
   * @modifier:User
   * @modifined date :Dec 4, 2017
   * @exeption:
   */
  public User() {
  }
  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }
  /**
   * @param firstName
   *          the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }
  /**
   * @param lastName
   *          the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  /**
   * @return the phone
   */
  public String getPhone() {
    return phone;
  }
  /**
   * @param phone
   *          the phone to set
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }
  /**
   * @return the desCaption
   */
  public String getDesCaption() {
    return desCaption;
  }
  /**
   * @param desCaption
   *          the desCaption to set
   */
  public void setDesCaption(String desCaption) {
    this.desCaption = desCaption;
  }
  /**
   * @return the image
   */
  public String getImage() {
    return image;
  }
  /**
   * @param image
   *          the image to set
   */
  public void setImage(String image) {
    this.image = image;
  }
  /**
   * @return the gender
   */
  public String getGender() {
    return gender;
  }
  /**
   * @param gender
   *          the gender to set
   */
  public void setGender(String gender) {
    this.gender = gender;
  }
  /**
   * @return the vehicle
   */
  public String getVehicle() {
    return vehicle;
  }
  /**
   * @param vehicle
   *          the vehicle to set
   */
  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }
  /**
   * @return the option
   */
  public String getOption() {
    return option;
  }
  /**
   * @param option
   *          the option to set
   */
  public void setOption(String option) {
    this.option = option;
  }

  /**
   *
   */
  private String lastName;
  /**
   *
   */
  private String phone;
  /**
   *
   */
  private String desCaption;
  /**
   *
   */
  private String image;
  /**
   *
   */
  private String gender;
  /**
   *
   */
  private String vehicle;
  /**
   *
   */
  private String option;
  /**
   *
   */
  private int    id;

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }
  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

}
