public class Student{
private String name;
private double average;
public Student(String name, double average){
this.name = name;
if(average > 0.0){
this.average = average;
    }
  }
}
public void setName(String name) {
this.name = name;
public String getName() {
return name;
}
public void setAverage(double studentAverage) {
if (average > 0.0) {
if (average <=100.0) {
this.average = average;
   }
  }
}
public double getAverage () {
return average;
}
public String getLetterGrade() {
String lettergrade = "";
if (average >=90.0) {
letterGrade = "A";
}
else if (average >= 80.0) {
letterGrade