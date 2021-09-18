import java.util.Scanner;


/**
 * paciente // triagem.
 *
 * @author (Izabel)
 * @version (a version number or a date)
 */
public class paciente
{
    public double altura;
    public double peso;
    public double pressaoSistolica;
    public double pressaoDiastolica;
    public double temperatura;
    public double frequenciaRespiratoria;
    public double frequenciaCardiaca;
    public double saturacao;
    public String classeIMC;
    public String classePressaoArterial;
    
    public paciente()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("altura?");
        altura = input.nextDouble();
        System.out.println("peso?");
        peso = input.nextDouble();
        classeIMC=calcularIMC(peso,altura);
        System.out.println("pressäo arterial sistolica?");
        pressaoSistolica= input.nextDouble();
        System.out.println("pressäo arterial diastolica?");
        pressaoDiastolica= input.nextDouble();
        classePressaoArterial=classificarPressaoArterial( pressaoDiastolica , pressaoSistolica);
    }

    public String calcularIMC(double peso,double altura)
    {
        double IMC=peso/(altura*altura);
        
        if (IMC <10) {return "desnutricao grau 5";}
        else if (IMC >=10 && IMC<13) {return "desnutricao grau 4";}
        else if (IMC >=13 && IMC<16) {return "desnutricao grau 3";}
        else if (IMC >=16 && IMC<17) {return "desnutricao grau 2";}
        else if (IMC >=17 && IMC<18.5){return "desnutricao grau 1";}
        else if (IMC >=18.5 && IMC<25){return " peso normal";}
        else if (IMC >=25 && IMC<30){return " pré obesidade";}
        else if (IMC >=30 && IMC<35){return "obesidade grau 1";}
        else if (IMC >=35 && IMC<40){return "obesidade grau 2";}
        else if (IMC >=40 ){return "obesidade grau 3";}
        else {return "calculo do IMC falhou";}
    }
    
    public String  classificarPressaoArterial(double PAD,double PAS)
    {
        double PAM= PAD + (PAS - PAD)/3;

        if (PAD <90 && PAD>=85 && PAS>=130 && PAS <140) {return "normotenso limitrofe";}
        else if (PAD >=90 && PAD <100 && PAS>=140 && PAS < 160) {return "hipertensäo leve";}
        else if (PAD >=100 && PAD <110 && PAS >=160 && PAS <180) {return "hipertensäo moderada";}
        else if (PAD >=110 && PAS>=180) {return "hipertensäo grave";}
        else if (PAD <90 && PAS>=140){return "hipertensäo sistolica isolada";}
       else if (PAD <85 && PAS<=130){return "normal";}
        else {return "classificacäo inexistente";}
    }
}
