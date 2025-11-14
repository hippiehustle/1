package G;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1676a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f1677b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1678c = new Object();

    public static Typeface a(Context context, int i4) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i4, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, int i4, TypedValue typedValue, int i8, b bVar, boolean z8, boolean z9) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (!charSequence2.startsWith("res/")) {
                if (bVar != null) {
                    bVar.a(-3);
                }
            } else {
                int i9 = typedValue.assetCookie;
                t.i iVar = H.f.f1856b;
                Typeface typeface2 = (Typeface) iVar.f(H.f.b(resources, i4, charSequence2, i9, i8));
                if (typeface2 != null) {
                    if (bVar != null) {
                        new Handler(Looper.getMainLooper()).post(new k(bVar, 0, typeface2));
                    }
                    typeface = typeface2;
                } else if (!z9) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            e i10 = b.i(resources.getXml(i4), resources);
                            if (i10 == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (bVar != null) {
                                    bVar.a(-3);
                                }
                            } else {
                                typeface = H.f.a(context, i10, resources, i4, charSequence2, typedValue.assetCookie, i8, bVar, z8);
                            }
                        } else {
                            int i11 = typedValue.assetCookie;
                            Typeface m6 = H.f.f1855a.m(context, resources, i4, charSequence2, i8);
                            if (m6 != null) {
                                iVar.j(H.f.b(resources, i4, charSequence2, i11, i8), m6);
                            }
                            if (bVar != null) {
                                if (m6 != null) {
                                    new Handler(Looper.getMainLooper()).post(new k(bVar, 0, m6));
                                } else {
                                    bVar.a(-3);
                                }
                            }
                            typeface = m6;
                        }
                    } catch (IOException e9) {
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e9);
                        if (bVar != null) {
                            bVar.a(-3);
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    } catch (XmlPullParserException e10) {
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e10);
                        if (bVar != null) {
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    }
                }
            }
            if (typeface != null && bVar == null && !z9) {
                throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
            }
            return typeface;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i4) + "\" (" + Integer.toHexString(i4) + ") is not a Font: " + typedValue);
    }
}
