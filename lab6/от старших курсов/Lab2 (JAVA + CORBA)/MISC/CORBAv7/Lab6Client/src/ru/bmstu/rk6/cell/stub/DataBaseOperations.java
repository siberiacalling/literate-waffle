package ru.bmstu.rk6.cell.stub;


/**
* Cell/DataBaseOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cell.idl
* Wednesday, December 14, 2011 10:06:30 PM MSK
*/

public interface DataBaseOperations 
{
  boolean registerStation (String stationName);
  boolean registerTube (String stationName, String tubeName);
  String getStationByTube (String tubeName, String receiverName);
} // interface DataBaseOperations
