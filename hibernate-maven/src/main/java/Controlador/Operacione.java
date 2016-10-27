/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Modelo.*;
/**
 *
 * @author Juan
 */
public class Operacione {
    public void altaVehiculos(Vehiculo vehiculo){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(vehiculo);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Datos insertados correctamete");
    }

    
    public void altaComponentesInternos(ComponentesInternos internos){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(internos);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Datos insertados correctamete");
    }
    public Vehiculo buscarVehiculo(int carro){
        Vehiculo vehiculo;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        vehiculo = (Vehiculo)session.get(Vehiculo.class,carro);
        tx.commit();
        session.close();
        return vehiculo;
    }
    
    public void altaComponentesExternos(ComponentesExternos externos){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(externos);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Datos insertados correctamete");
    }
    
    public void altaLlantas(Llantas llantas){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(llantas);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Datos insertados correctamete");
    }
    
}
