package ru.bmstu.rk6.cell.stub;

/**
* Cell/lowBalanceExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cell.idl
* Wednesday, December 14, 2011 10:06:30 PM MSK
*/

public final class lowBalanceExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public ru.bmstu.rk6.cell.stub.lowBalanceException value = null;

  public lowBalanceExceptionHolder ()
  {
  }

  public lowBalanceExceptionHolder (ru.bmstu.rk6.cell.stub.lowBalanceException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ru.bmstu.rk6.cell.stub.lowBalanceExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ru.bmstu.rk6.cell.stub.lowBalanceExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ru.bmstu.rk6.cell.stub.lowBalanceExceptionHelper.type ();
  }

}
