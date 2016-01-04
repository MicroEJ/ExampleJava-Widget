/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.microej.demo.widgets.style;

import ej.style.font.AbstractFontLoader;
import ej.style.font.FontProfile;

/**
 * The font loader used in the application.
 */
public class WidgetsFontLoader extends AbstractFontLoader {

	private static final int LARGE_HEIGHT = 50;
	private static final int MEDIUM_HEIGHT = 30;

	@Override
	protected int getFontHeight(FontProfile fontProfile) {
		switch (fontProfile.getSize()) {
		case LENGTH:
			return fontProfile.getSizeValue();
		case LARGE:
			return LARGE_HEIGHT;
		case MEDIUM:
		default:
			return MEDIUM_HEIGHT;
		}
	}

}
