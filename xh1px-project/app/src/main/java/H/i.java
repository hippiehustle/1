package H;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: i, reason: collision with root package name */
    public final Class f1866i;
    public final Constructor j;
    public final Method k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f1867l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f1868m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f1869n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f1870o;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = W(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = X(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e9.getClass().getName()), e9);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1866i = cls;
        this.j = constructor;
        this.k = method2;
        this.f1867l = method3;
        this.f1868m = method4;
        this.f1869n = method5;
        this.f1870o = method;
    }

    public static Method W(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean T(Context context, Object obj, String str, int i4, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface U(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1866i, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1870o.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean V(Object obj) {
        try {
            return ((Boolean) this.f1868m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method X(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // H.g, E2.b
    public final Typeface i(Context context, G.f fVar, Resources resources, int i4) {
        Object obj;
        Method method = this.k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.j.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                G.g[] gVarArr = fVar.f1653a;
                int length = gVarArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        G.g gVar = gVarArr[i8];
                        Context context2 = context;
                        if (!T(context2, obj, gVar.f1654a, gVar.f1658e, gVar.f1655b, gVar.f1656c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f1657d))) {
                            try {
                                this.f1869n.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i8++;
                            context = context2;
                        }
                    } else if (V(obj)) {
                        return U(obj);
                    }
                }
            }
            return null;
        }
        return super.i(context, fVar, resources, i4);
    }

    @Override // H.g, E2.b
    public final Typeface j(Context context, M.j[] jVarArr, int i4) {
        Object obj;
        Typeface U8;
        boolean z8;
        if (jVarArr.length >= 1) {
            Method method = this.k;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (M.j jVar : jVarArr) {
                        if (jVar.f3293e == 0) {
                            Uri uri = jVar.f3289a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, E2.c.g0(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.j.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = jVarArr.length;
                        int i8 = 0;
                        boolean z9 = false;
                        while (true) {
                            Method method2 = this.f1869n;
                            if (i8 < length) {
                                M.j jVar2 = jVarArr[i8];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f3289a);
                                if (byteBuffer != null) {
                                    try {
                                        z8 = ((Boolean) this.f1867l.invoke(obj, byteBuffer, Integer.valueOf(jVar2.f3290b), null, Integer.valueOf(jVar2.f3291c), Integer.valueOf(jVar2.f3292d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z8 = false;
                                    }
                                    if (!z8) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z9 = true;
                                }
                                i8++;
                                z9 = z9;
                            } else if (!z9) {
                                method2.invoke(obj, null);
                            } else if (V(obj) && (U8 = U(obj)) != null) {
                                return Typeface.create(U8, i4);
                            }
                        }
                    }
                } else {
                    M.j q6 = q(jVarArr, i4);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q6.f3289a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(q6.f3291c).setItalic(q6.f3292d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // E2.b
    public final Typeface m(Context context, Resources resources, int i4, String str, int i8) {
        Object obj;
        Method method = this.k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.j.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!T(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f1869n.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (V(obj)) {
                    return U(obj);
                }
            }
            return null;
        }
        return super.m(context, resources, i4, str, i8);
    }
}
