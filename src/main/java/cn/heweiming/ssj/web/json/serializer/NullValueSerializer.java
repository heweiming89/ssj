package cn.heweiming.ssj.web.json.serializer;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author heweiming  2017年9月23日 下午5:19:45
 * @version 1.0.0
 * @description 
 */
public class NullValueSerializer extends JsonSerializer<Object> {

    public Class<?> propertyType;

    public NullValueSerializer(Class<?> propertyType) {
        super();
        this.propertyType = propertyType;
    }

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException, JsonProcessingException {
        if (isArrayType(propertyType)) {
            gen.writeStartArray();
            gen.writeEndArray();
        } else if (isNumberType(propertyType)) {
            gen.writeNumber(0);
        } else if (isBooleanType(propertyType)) {
            gen.writeBoolean(false);
        } else if (isStringType(propertyType)) {
            gen.writeString("");
        } else {
            gen.writeObject(value);
        }

    }

    /**
     * 判断属性类型是否是 array
     *
     * @param propertyType
     * @return
     */
    protected static boolean isArrayType(Class<?> propertyType) {
        return propertyType.isArray() || List.class.isAssignableFrom(propertyType)
                || Set.class.isAssignableFrom(propertyType);
    }

    /**
     * 判断属性类型是否是 number
     *
     * @param propertyType
     * @return
     */
    protected static boolean isNumberType(Class<?> propertyType) {
        return Number.class.isAssignableFrom(propertyType);
    }

    /**
     * 判断属性类型是否是 boolean
     *
     * @param propertyType
     * @return
     */
    protected static boolean isBooleanType(Class<?> propertyType) {
        return Boolean.class.equals(propertyType);
    }

    /**
     * 判断属性类型是否是 string
     *
     * @param propertyType
     * @return
     */
    protected static boolean isStringType(Class<?> propertyType) {
        return String.class.equals(propertyType);
    }

}
