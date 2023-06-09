/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public enum RpcError {
  NoError,
  TimedOut,
  ConnectionError,
  AuthenticationError,
  ParseError,
  ServerIsTooNew,
  ServerIsTooOld;

  public final int swigValue() {
    return swigValue;
  }

  public static RpcError swigToEnum(int swigValue) {
    RpcError[] swigValues = RpcError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (RpcError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + RpcError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private RpcError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private RpcError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private RpcError(RpcError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

