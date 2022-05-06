// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enumerations.proto

package example.enumerations;

public final class Enumerations {
  private Enumerations() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code example.enumerations.EyeColor}
   */
  public enum EyeColor
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EYE_COLOR_UNSPECIFIED = 0;</code>
     */
    EYE_COLOR_UNSPECIFIED(0),
    /**
     * <code>EYE_COLOR_GREEN = 1;</code>
     */
    EYE_COLOR_GREEN(1),
    /**
     * <code>EYE_COLOR_BLUE = 2;</code>
     */
    EYE_COLOR_BLUE(2),
    /**
     * <code>EYE_COLOR_BROWN = 3;</code>
     */
    EYE_COLOR_BROWN(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EYE_COLOR_UNSPECIFIED = 0;</code>
     */
    public static final int EYE_COLOR_UNSPECIFIED_VALUE = 0;
    /**
     * <code>EYE_COLOR_GREEN = 1;</code>
     */
    public static final int EYE_COLOR_GREEN_VALUE = 1;
    /**
     * <code>EYE_COLOR_BLUE = 2;</code>
     */
    public static final int EYE_COLOR_BLUE_VALUE = 2;
    /**
     * <code>EYE_COLOR_BROWN = 3;</code>
     */
    public static final int EYE_COLOR_BROWN_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EyeColor valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EyeColor forNumber(int value) {
      switch (value) {
        case 0: return EYE_COLOR_UNSPECIFIED;
        case 1: return EYE_COLOR_GREEN;
        case 2: return EYE_COLOR_BLUE;
        case 3: return EYE_COLOR_BROWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EyeColor>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EyeColor> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EyeColor>() {
            public EyeColor findValueByNumber(int number) {
              return EyeColor.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return example.enumerations.Enumerations.getDescriptor().getEnumTypes().get(0);
    }

    private static final EyeColor[] VALUES = values();

    public static EyeColor valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EyeColor(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:example.enumerations.EyeColor)
  }

  public interface EnumerationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:example.enumerations.Enumeration)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.example.enumerations.EyeColor eye_color = 1;</code>
     * @return The enum numeric value on the wire for eyeColor.
     */
    int getEyeColorValue();
    /**
     * <code>.example.enumerations.EyeColor eye_color = 1;</code>
     * @return The eyeColor.
     */
    example.enumerations.Enumerations.EyeColor getEyeColor();
  }
  /**
   * Protobuf type {@code example.enumerations.Enumeration}
   */
  public static final class Enumeration extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:example.enumerations.Enumeration)
      EnumerationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Enumeration.newBuilder() to construct.
    private Enumeration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Enumeration() {
      eyeColor_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Enumeration();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Enumeration(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              eyeColor_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return example.enumerations.Enumerations.internal_static_example_enumerations_Enumeration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return example.enumerations.Enumerations.internal_static_example_enumerations_Enumeration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              example.enumerations.Enumerations.Enumeration.class, example.enumerations.Enumerations.Enumeration.Builder.class);
    }

    public static final int EYE_COLOR_FIELD_NUMBER = 1;
    private int eyeColor_;
    /**
     * <code>.example.enumerations.EyeColor eye_color = 1;</code>
     * @return The enum numeric value on the wire for eyeColor.
     */
    @java.lang.Override public int getEyeColorValue() {
      return eyeColor_;
    }
    /**
     * <code>.example.enumerations.EyeColor eye_color = 1;</code>
     * @return The eyeColor.
     */
    @java.lang.Override public example.enumerations.Enumerations.EyeColor getEyeColor() {
      @SuppressWarnings("deprecation")
      example.enumerations.Enumerations.EyeColor result = example.enumerations.Enumerations.EyeColor.valueOf(eyeColor_);
      return result == null ? example.enumerations.Enumerations.EyeColor.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (eyeColor_ != example.enumerations.Enumerations.EyeColor.EYE_COLOR_UNSPECIFIED.getNumber()) {
        output.writeEnum(1, eyeColor_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eyeColor_ != example.enumerations.Enumerations.EyeColor.EYE_COLOR_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, eyeColor_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof example.enumerations.Enumerations.Enumeration)) {
        return super.equals(obj);
      }
      example.enumerations.Enumerations.Enumeration other = (example.enumerations.Enumerations.Enumeration) obj;

      if (eyeColor_ != other.eyeColor_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EYE_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + eyeColor_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static example.enumerations.Enumerations.Enumeration parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static example.enumerations.Enumerations.Enumeration parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static example.enumerations.Enumerations.Enumeration parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static example.enumerations.Enumerations.Enumeration parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(example.enumerations.Enumerations.Enumeration prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code example.enumerations.Enumeration}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:example.enumerations.Enumeration)
        example.enumerations.Enumerations.EnumerationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return example.enumerations.Enumerations.internal_static_example_enumerations_Enumeration_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return example.enumerations.Enumerations.internal_static_example_enumerations_Enumeration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                example.enumerations.Enumerations.Enumeration.class, example.enumerations.Enumerations.Enumeration.Builder.class);
      }

      // Construct using example.enumerations.Enumerations.Enumeration.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        eyeColor_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return example.enumerations.Enumerations.internal_static_example_enumerations_Enumeration_descriptor;
      }

      @java.lang.Override
      public example.enumerations.Enumerations.Enumeration getDefaultInstanceForType() {
        return example.enumerations.Enumerations.Enumeration.getDefaultInstance();
      }

      @java.lang.Override
      public example.enumerations.Enumerations.Enumeration build() {
        example.enumerations.Enumerations.Enumeration result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public example.enumerations.Enumerations.Enumeration buildPartial() {
        example.enumerations.Enumerations.Enumeration result = new example.enumerations.Enumerations.Enumeration(this);
        result.eyeColor_ = eyeColor_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof example.enumerations.Enumerations.Enumeration) {
          return mergeFrom((example.enumerations.Enumerations.Enumeration)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(example.enumerations.Enumerations.Enumeration other) {
        if (other == example.enumerations.Enumerations.Enumeration.getDefaultInstance()) return this;
        if (other.eyeColor_ != 0) {
          setEyeColorValue(other.getEyeColorValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        example.enumerations.Enumerations.Enumeration parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (example.enumerations.Enumerations.Enumeration) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int eyeColor_ = 0;
      /**
       * <code>.example.enumerations.EyeColor eye_color = 1;</code>
       * @return The enum numeric value on the wire for eyeColor.
       */
      @java.lang.Override public int getEyeColorValue() {
        return eyeColor_;
      }
      /**
       * <code>.example.enumerations.EyeColor eye_color = 1;</code>
       * @param value The enum numeric value on the wire for eyeColor to set.
       * @return This builder for chaining.
       */
      public Builder setEyeColorValue(int value) {
        
        eyeColor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.example.enumerations.EyeColor eye_color = 1;</code>
       * @return The eyeColor.
       */
      @java.lang.Override
      public example.enumerations.Enumerations.EyeColor getEyeColor() {
        @SuppressWarnings("deprecation")
        example.enumerations.Enumerations.EyeColor result = example.enumerations.Enumerations.EyeColor.valueOf(eyeColor_);
        return result == null ? example.enumerations.Enumerations.EyeColor.UNRECOGNIZED : result;
      }
      /**
       * <code>.example.enumerations.EyeColor eye_color = 1;</code>
       * @param value The eyeColor to set.
       * @return This builder for chaining.
       */
      public Builder setEyeColor(example.enumerations.Enumerations.EyeColor value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        eyeColor_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.example.enumerations.EyeColor eye_color = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEyeColor() {
        
        eyeColor_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:example.enumerations.Enumeration)
    }

    // @@protoc_insertion_point(class_scope:example.enumerations.Enumeration)
    private static final example.enumerations.Enumerations.Enumeration DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new example.enumerations.Enumerations.Enumeration();
    }

    public static example.enumerations.Enumerations.Enumeration getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Enumeration>
        PARSER = new com.google.protobuf.AbstractParser<Enumeration>() {
      @java.lang.Override
      public Enumeration parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Enumeration(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Enumeration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Enumeration> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public example.enumerations.Enumerations.Enumeration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_enumerations_Enumeration_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_enumerations_Enumeration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022enumerations.proto\022\024example.enumeratio" +
      "ns\"@\n\013Enumeration\0221\n\teye_color\030\001 \001(\0162\036.e" +
      "xample.enumerations.EyeColor*c\n\010EyeColor" +
      "\022\031\n\025EYE_COLOR_UNSPECIFIED\020\000\022\023\n\017EYE_COLOR" +
      "_GREEN\020\001\022\022\n\016EYE_COLOR_BLUE\020\002\022\023\n\017EYE_COLO" +
      "R_BROWN\020\003b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_example_enumerations_Enumeration_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_enumerations_Enumeration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_enumerations_Enumeration_descriptor,
        new java.lang.String[] { "EyeColor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
