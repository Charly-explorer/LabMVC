/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author jprod
 */
public interface IManager<T> extends IManagerAbstract<T> {

    public boolean set(T element);

    public boolean remove(T element);
        
}
