package entities;

public class gradesCalc {
         public double nota1;
         public double nota2;
         public double nota3;
         public String name;
         
public double calcGrade() {
	return nota1 + nota2 + nota3;
}
public double points() {
	if (calcGrade() < 60) {
		return 60.0 - calcGrade();
	} else {
		return 0.0;
	}
}

}

