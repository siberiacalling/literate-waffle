package Cell;


/**
* Cell/StationPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cell.idl
* Monday, December 12, 2011 7:02:05 PM MSK
*/


/* ýýýýýýýýý ýýýýýýý ýýýýýýý */
public abstract class StationPOA extends org.omg.PortableServer.Servant
 implements Cell.StationOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("register", new java.lang.Integer (0));
    _methods.put ("registerStation", new java.lang.Integer (1));
    _methods.put ("sendSMS", new java.lang.Integer (2));
    _methods.put ("getOponent", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /* ýýý ýýýýýýýýý ýýýýýý ýýýýýý ýýýýýýýýýýýý ýýýýýý TubeCallback */
       case 0:  // Cell/Station/register
       {
         Cell.TubeCallback objRef = Cell.TubeCallbackHelper.read (in);
         String phoneNum = in.read_string ();
         int $result = (int)0;
         $result = this.register (objRef, phoneNum);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // Cell/Station/registerStation
       {
         Cell.Station objRef = Cell.StationHelper.read (in);
         String stationName = in.read_string ();
         int $result = (int)0;
         $result = this.registerStation (objRef, stationName);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }


  /* ýýýýýýýýý ýýýýýýýýý message ýý ýýýýýý fromNum ý ýýýýýý toNum */
       case 2:  // Cell/Station/sendSMS
       {
         String fromNum = in.read_string ();
         String toNum = in.read_string ();
         String message = in.read_string ();
         int $result = (int)0;
         $result = this.sendSMS (fromNum, toNum, message);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // Cell/Station/getOponent
       {
         String num = in.read_string ();
         Cell.TubeCallback $result = null;
         $result = this.getOponent (num);
         out = $rh.createReply();
         Cell.TubeCallbackHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Cell/Station:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Station _this() 
  {
    return StationHelper.narrow(
    super._this_object());
  }

  public Station _this(org.omg.CORBA.ORB orb) 
  {
    return StationHelper.narrow(
    super._this_object(orb));
  }


} // class StationPOA
