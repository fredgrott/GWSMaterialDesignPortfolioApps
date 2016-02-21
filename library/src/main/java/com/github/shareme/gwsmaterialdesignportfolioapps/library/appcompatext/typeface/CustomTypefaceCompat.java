/*
 * Copyright (C) 2016 Fred Grott(aka shareme GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under License.
 */
package com.github.shareme.gwsmaterialdesignportfolioapps.library.appcompatext.typeface;

/**
 * A custom typeface compat to allow setting custom type faces and loading
 * custom typefaces at application start-up.
 *
 * It is assumed that the default supplied fonts in assets/fonts are the compat fonts
 * covering target api 16 to 23, ie most of them Roboto.
 *
 * <b>Background</b>
 *
 * api 16 family name
 * ap1 21 family name font weight style, new L way for fonts
 *
 * excluded fonts
 *
 * api 16
 *
 * CarroisGothicSC-Regular
 * ComingSoon
 * CutiveMono
 * DancingScript-Bold
 * DancingScript-Regular
 * NotoSerif-Bold
 * NotoSerif-BoldItalic
 * NotoSerif-Italic
 * NotoSerif-Regular
 * Roboto-Black
 * Roboto-BlackItalic
 * Roboto-Medium
 * Roboto-MediumItalic
 * Roboto-Thin
 * Roboto-ThinItalic
 *
 * api 17
 *
 * CarroisGothicSC-Regular
 * ComingSoon
 * CutiveMono
 * DancingScript-Bold
 * DancingScript-Regular
 * NotoSerif-Bold
 * NotoSerif-BoldItalic
 * NotoSerif-Italic
 * NotoSerif-Regular
 * Roboto-Black
 * Roboto-BlackItalic
 * Roboto-Medium
 * Roboto-MediumItalic
 *
 * api 18
 *
 * CarroisGothicSC-Regular
 * ComingSoon
 * CutiveMono
 * DancingScript-Bold
 * DancingScript-Regular
 * NotoSerif-Bold
 * NotoSerif-BoldItalic
 * NotoSerif-Italic
 * NotoSerif-Regular
 * Roboto-Black
 * Roboto-BlackItalic
 * Roboto-Medium
 * Roboto-MediumItalic
 *
 * api 19
 *
 * CarroisGothicSC-Regular
 * ComingSoon
 * CutiveMono
 * DancingScript-Bold
 * DancingScript-Regular
 * NotoSerif-Bold
 * NotoSerif-BoldItalic
 * NotoSerif-Italic
 * NotoSerif-Regular
 * Roboto-Black
 * Roboto-BlackItalic
 * Roboto-Medium
 * Roboto-MediumItalic
 *
 * api 20
 *
 * CarroisGothicSC-Regular
 * ComingSoon
 * CutiveMono
 * DancingScript-Bold
 * DancingScript-Regular
 * NotoSerif-Bold
 * NotoSerif-BoldItalic
 * NotoSerif-Italic
 * NotoSerif-Regular
 * Roboto-Black
 * Roboto-BlackItalic
 * Roboto-Medium
 * Roboto-MediumItalic
 *
 * api 21
 *
 * api 22
 *
 * api 23
 *
 * <b>Implementation</b>
 *
 * 3rd-party developer is expected to extend this class to introduce the custom fonts
 * they want loaded and is expected to call the right init methods in the onCreate app
 * class before the super so that custom fonts can be loaded.
 *
 * It is assumed that we are loading our own custom custom layout inflater factory via the
 * CustomTypefaceCompatFactory and that we have to extend that so we can inflate any
 * custom widgets.
 *
 *
 * Created by fgrott on 2/17/2016.
 */
@SuppressWarnings("unused")
public class CustomTypefaceCompat {
}
