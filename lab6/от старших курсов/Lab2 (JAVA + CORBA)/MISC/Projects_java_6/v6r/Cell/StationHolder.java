package Cell;

/**
* Cell/StationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cell.idl
* Monday, December 12, 2011 7:02:05 PM MSK
*/


/* ýýýýýýýýý ýýýýýýý ýýýýýýý */
public final class StationHolder implements org.omg.CORBA.portable.Streamable
{
  public Cell.Station value = null;

  public StationHolder ()
  {
  }

  public StationHolder (Cell.Station initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Cell.StationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Cell.StationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Cell.StationHelper.type ();
  }

}
