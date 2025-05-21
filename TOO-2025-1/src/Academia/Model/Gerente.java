/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia.Model;

/**
 *
 * @author 20212pf.cc0012
 */
public class Gerente extends Funcionario {

    @Override
    public double calculaSalarioMes() {
        return salario * 1.50;
    }
    
}
