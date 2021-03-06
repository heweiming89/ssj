package cn.heweiming.ssj.web.convert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.util.StringUtils;

import cn.heweiming.ssj.enums.DisplayedEnum;

/**
 * @author heweiming  2017年9月23日 下午5:19:07
 * @version 1.0.0
 * @description 
 */
@SuppressWarnings("rawtypes")
public class StringToDisplayedEnumConverterFactory implements ConverterFactory<String, DisplayedEnum> {

    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(StringToDisplayedEnumConverterFactory.class);

    @Override
    public <T extends DisplayedEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToEnumConverter<T>(targetType);
    }

    private final class StringToEnumConverter<T extends DisplayedEnum> implements Converter<String, T> {

        private Class<T> enumType;

        public StringToEnumConverter(Class<T> enumType) {
            this.enumType = enumType;
        }

        public T convert(String source) {
            if (StringUtils.isEmpty(source)) {
                return null;
            }
            T displayedEnum = DisplayedEnum.valueOfEnum(this.enumType, source.trim());
            if (displayedEnum == null) {
                logger.warn("枚举类{} value为{}的枚举不存在", enumType.getSimpleName(), source);
            }
            return displayedEnum;
        }

    }

}
