/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
/**
 * Абстрактное представление об эталоне проектирования
 * "Фабрика".
 *
 * @param <Result> тип, описывающий значения, создаваемые фабрикой.
 * @param <Param> тип, описывающий принимаемый фабрикой параметр
 */
public interface Factory<Result, Param> {

    /**
     * Возвращает экземпляр, создаваемый фабрикой.
     *
     * @param param
     * @return новый экземпляр типа {@code T}
     */
    Result getInstance(Param param);
}

