/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;

/**
 *
 * @author luiar
 */
public class CRUDMVC {

    public static void main(String[] args) {
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmProducto frm = new frmProducto();
        
        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
