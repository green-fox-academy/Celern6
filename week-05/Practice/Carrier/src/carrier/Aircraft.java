package carrier;

public class Aircraft {

  public String type;
  public int maxAmmo;
  public int currentAmmo;
  public int baseDamage;

  public Aircraft(String type, int maxAmmo, int currentAmmo, int baseDamage){
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = currentAmmo;
  }

  public int figth (){
    int damage = this.currentAmmo*baseDamage;
    this.currentAmmo = 0;
    return damage;
  }

  public int reFill(int fillAmmo){
    int surplus = 0;
    currentAmmo += fillAmmo;
    if (currentAmmo > maxAmmo){
      surplus = currentAmmo - maxAmmo;
      currentAmmo -= currentAmmo - maxAmmo;
    }
    return surplus;
  }
  public String getType(){
    return type;
  }
  public String getStatus(){
    return "Type: " + getType() + ", Ammo: " + currentAmmo
        + ", Base damage: " + baseDamage + ", All damage: " + currentAmmo*baseDamage;
  }
  public boolean isPriority (){
    if (type == "F35"){
      return true;
    }
    if (type == "F16"){
      return false;
    }
    return false;
  }
}
