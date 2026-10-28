package cn.hutool.core.img;

import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorUtilTest {

	@Test
	public void getColorByNameTurkishLocaleTest() {
		final Locale defaultLocale = Locale.getDefault();
		Locale.setDefault(Locale.forLanguageTag("tr-TR"));
		try {
			assertEquals(Color.WHITE, ColorUtil.getColor("white"));
			assertEquals(Color.PINK, ColorUtil.getColor("pink"));
			assertEquals(Color.LIGHT_GRAY, ColorUtil.getColor("light_gray"));
		} finally {
			Locale.setDefault(defaultLocale);
		}
	}
}
