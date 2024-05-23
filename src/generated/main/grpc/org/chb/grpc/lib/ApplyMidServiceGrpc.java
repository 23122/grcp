package org.chb.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: ApplyMid.proto")
public final class ApplyMidServiceGrpc {

  private ApplyMidServiceGrpc() {}

  public static final String SERVICE_NAME = "ApplyMidService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.chb.grpc.lib.ApplyMidRequest,
      org.chb.grpc.lib.ApplyMidResponse> getSendApplyMidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendApplyMid",
      requestType = org.chb.grpc.lib.ApplyMidRequest.class,
      responseType = org.chb.grpc.lib.ApplyMidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chb.grpc.lib.ApplyMidRequest,
      org.chb.grpc.lib.ApplyMidResponse> getSendApplyMidMethod() {
    io.grpc.MethodDescriptor<org.chb.grpc.lib.ApplyMidRequest, org.chb.grpc.lib.ApplyMidResponse> getSendApplyMidMethod;
    if ((getSendApplyMidMethod = ApplyMidServiceGrpc.getSendApplyMidMethod) == null) {
      synchronized (ApplyMidServiceGrpc.class) {
        if ((getSendApplyMidMethod = ApplyMidServiceGrpc.getSendApplyMidMethod) == null) {
          ApplyMidServiceGrpc.getSendApplyMidMethod = getSendApplyMidMethod =
              io.grpc.MethodDescriptor.<org.chb.grpc.lib.ApplyMidRequest, org.chb.grpc.lib.ApplyMidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendApplyMid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.grpc.lib.ApplyMidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.grpc.lib.ApplyMidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplyMidServiceMethodDescriptorSupplier("SendApplyMid"))
              .build();
        }
      }
    }
    return getSendApplyMidMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplyMidServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplyMidServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplyMidServiceStub>() {
        @java.lang.Override
        public ApplyMidServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplyMidServiceStub(channel, callOptions);
        }
      };
    return ApplyMidServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplyMidServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplyMidServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplyMidServiceBlockingStub>() {
        @java.lang.Override
        public ApplyMidServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplyMidServiceBlockingStub(channel, callOptions);
        }
      };
    return ApplyMidServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApplyMidServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplyMidServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplyMidServiceFutureStub>() {
        @java.lang.Override
        public ApplyMidServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplyMidServiceFutureStub(channel, callOptions);
        }
      };
    return ApplyMidServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ApplyMidServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendApplyMid(org.chb.grpc.lib.ApplyMidRequest request,
        io.grpc.stub.StreamObserver<org.chb.grpc.lib.ApplyMidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendApplyMidMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendApplyMidMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chb.grpc.lib.ApplyMidRequest,
                org.chb.grpc.lib.ApplyMidResponse>(
                  this, METHODID_SEND_APPLY_MID)))
          .build();
    }
  }

  /**
   */
  public static final class ApplyMidServiceStub extends io.grpc.stub.AbstractAsyncStub<ApplyMidServiceStub> {
    private ApplyMidServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplyMidServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplyMidServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendApplyMid(org.chb.grpc.lib.ApplyMidRequest request,
        io.grpc.stub.StreamObserver<org.chb.grpc.lib.ApplyMidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendApplyMidMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ApplyMidServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApplyMidServiceBlockingStub> {
    private ApplyMidServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplyMidServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplyMidServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.chb.grpc.lib.ApplyMidResponse sendApplyMid(org.chb.grpc.lib.ApplyMidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendApplyMidMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApplyMidServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ApplyMidServiceFutureStub> {
    private ApplyMidServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplyMidServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplyMidServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chb.grpc.lib.ApplyMidResponse> sendApplyMid(
        org.chb.grpc.lib.ApplyMidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendApplyMidMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_APPLY_MID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApplyMidServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApplyMidServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_APPLY_MID:
          serviceImpl.sendApplyMid((org.chb.grpc.lib.ApplyMidRequest) request,
              (io.grpc.stub.StreamObserver<org.chb.grpc.lib.ApplyMidResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ApplyMidServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApplyMidServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.chb.grpc.lib.ApplyMidProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApplyMidService");
    }
  }

  private static final class ApplyMidServiceFileDescriptorSupplier
      extends ApplyMidServiceBaseDescriptorSupplier {
    ApplyMidServiceFileDescriptorSupplier() {}
  }

  private static final class ApplyMidServiceMethodDescriptorSupplier
      extends ApplyMidServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApplyMidServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ApplyMidServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplyMidServiceFileDescriptorSupplier())
              .addMethod(getSendApplyMidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
