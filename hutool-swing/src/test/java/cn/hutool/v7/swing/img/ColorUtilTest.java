/*
 * Copyright (c) 2013-2026 Hutool Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hutool.v7.swing.img;

import cn.hutool.v7.swing.img.color.ColorUtil;
import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorUtilTest {

	@Test
	public void getColorTest(){
		final Color blue = ColorUtil.getColor("blue");
		assertEquals(Color.BLUE, blue);
	}

	@Test
	public void toCssRgbTest(){
		final String s = ColorUtil.toCssRgb(Color.BLUE);
		assertEquals("rgb(0,0,255)", s);
	}

	@Test
	public void toCssRgbaTest(){
		final String s = ColorUtil.toCssRgba(Color.BLUE);
		assertEquals("rgba(0,0,255,1.0)", s);
	}

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
