package pl.sdacademy.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

class MorseCodeDecoderTest {

    private final MorseCodeDictionary dictionary = new MorseCodeDictionary();
    private final MorseCodeDecoder decoder = new MorseCodeDecoder(dictionary);

    @ParameterizedTest
    @ArgumentsSource(ParamsProvider.class)
    void testDecodeHappyPath(String expectedText, String input) {

        // when
        final String actualText = decoder.decode(input);

        // then
        Assertions.assertEquals(expectedText, actualText);
    }
}