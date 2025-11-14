package H;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends E2.b {
    public static Font R(FontFamily fontFamily, int i4) {
        int i8;
        int i9;
        if ((i4 & 1) != 0) {
            i8 = 700;
        } else {
            i8 = 400;
        }
        if ((i4 & 2) != 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        FontStyle fontStyle = new FontStyle(i8, i9);
        Font font = fontFamily.getFont(0);
        int T5 = T(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int T8 = T(fontStyle, font2.getStyle());
            if (T8 < T5) {
                font = font2;
                T5 = T8;
            }
        }
        return font;
    }

    public static FontFamily S(M.j[] jVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (M.j jVar : jVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(jVar.f3289a, "r", null);
            } catch (IOException e9) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(jVar.f3291c).setSlant(jVar.f3292d ? 1 : 0).setTtcIndex(jVar.f3290b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int T(FontStyle fontStyle, FontStyle fontStyle2) {
        int i4;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i4 = 0;
        } else {
            i4 = 2;
        }
        return abs + i4;
    }

    @Override // E2.b
    public final Typeface i(Context context, G.f fVar, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (G.g gVar : fVar.f1653a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f1659f).setWeight(gVar.f1655b).setSlant(gVar.f1656c ? 1 : 0).setTtcIndex(gVar.f1658e).setFontVariationSettings(gVar.f1657d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(R(build2, i4).getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // E2.b
    public final Typeface j(Context context, M.j[] jVarArr, int i4) {
        try {
            FontFamily S8 = S(jVarArr, context.getContentResolver());
            if (S8 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(S8).setStyle(R(S8, i4).getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // E2.b
    public final Typeface k(Context context, List list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily S8 = S((M.j[]) list.get(0), contentResolver);
            if (S8 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(S8);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily S9 = S((M.j[]) list.get(i8), contentResolver);
                if (S9 != null) {
                    customFallbackBuilder.addCustomFallback(S9);
                }
            }
            return customFallbackBuilder.setStyle(R(S8, i4).getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // E2.b
    public final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // E2.b
    public final Typeface m(Context context, Resources resources, int i4, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // E2.b
    public final M.j q(M.j[] jVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
