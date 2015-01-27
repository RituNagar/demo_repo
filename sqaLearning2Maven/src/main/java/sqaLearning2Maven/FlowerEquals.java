package sqaLearning2Maven;
//Create a class “FlowerEquals” with properties:
//Name
//Color
//Season
//Overloaded constructor that takes “name”, “color” and “season” as parameter
//Write the getter and setters of these properties.
//Generate “equals” and “hashcode” method using Name and Color properties.

public class FlowerEquals {
String strName;
String strColor;
String strSeason;
public FlowerEquals(){}

public  FlowerEquals(String name, String color, String season){
	this.strName=name;
	this.strColor=color;
	this.strSeason=season;
}
public String getStrName() {
	return strName;
}
public void setStrName(String strName) {
	this.strName = strName;
}
public String getStrColor() {
	return strColor;
}
public void setStrColor(String strColor) {
	this.strColor = strColor;
}
public String getStrSeason() {
	return strSeason;
}
public void setStrSeason(String strSeason) {
	this.strSeason = strSeason;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((strColor == null) ? 0 : strColor.hashCode());
	result = prime * result + ((strName == null) ? 0 : strName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FlowerEquals other = (FlowerEquals) obj;
	if (strColor == null) {
		if (other.strColor != null)
			return false;
	} else if (!strColor.equals(other.strColor))
		return false;
	if (strName == null) {
		if (other.strName != null)
			return false;
	} else if (!strName.equals(other.strName))
		return false;
	return true;
}


}
