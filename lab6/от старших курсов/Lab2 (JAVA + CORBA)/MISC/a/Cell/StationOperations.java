package Cell;


/**
* Cell/StationOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cell.idl
* Thursday, December 8, 2011 12:51:51 PM MSK
*/


/* ��������� ������� ������� */
public interface StationOperations 
{

  /* ��� ��������� ������ ������ ������������ ������ TubeCallback */
  int register (Cell.TubeCallback objRef, String phoneNum);

  /* ��������� ��������� message �� ������ fromNum � ������ toNum */
  int sendSMS (String fromNum, String toNum, String message);
} // interface StationOperations
