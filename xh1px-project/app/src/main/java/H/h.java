package H;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public static final Class f1862d;

    /* renamed from: e, reason: collision with root package name */
    public static final Constructor f1863e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f1864f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f1865g;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi24Impl", e9.getClass().getName(), e9);
            cls = null;
            method = null;
            method2 = null;
        }
        f1863e = constructor;
        f1862d = cls;
        f1864f = method2;
        f1865g = method;
    }

    public static boolean R(Object obj, ByteBuffer byteBuffer, int i4, int i8, boolean z8) {
        try {
            return ((Boolean) f1864f.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i8), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface S(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f1862d, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1865g.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // E2.b
    public final Typeface i(Context context, G.f fVar, Resources resources, int i4) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f1863e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (G.g gVar : fVar.f1653a) {
                int i8 = gVar.f1659f;
                File Y = E2.c.Y(context);
                if (Y != null) {
                    try {
                        if (E2.c.P(Y, resources, i8)) {
                            try {
                                fileInputStream = new FileInputStream(Y);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && R(obj, mappedByteBuffer, gVar.f1658e, gVar.f1655b, gVar.f1656c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        Y.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return S(obj);
        }
        return null;
    }

    @Override // E2.b
    public final Typeface j(Context context, M.j[] jVarArr, int i4) {
        Object obj;
        try {
            obj = f1863e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i8 = 0;
            t.j jVar = new t.j(0);
            int length = jVarArr.length;
            while (true) {
                if (i8 < length) {
                    M.j jVar2 = jVarArr[i8];
                    Uri uri = jVar2.f3289a;
                    ByteBuffer byteBuffer = (ByteBuffer) jVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = E2.c.g0(context, uri);
                        jVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !R(obj, byteBuffer, jVar2.f3290b, jVar2.f3291c, jVar2.f3292d)) {
                        break;
                    }
                    i8++;
                } else {
                    Typeface S8 = S(obj);
                    if (S8 != null) {
                        return Typeface.create(S8, i4);
                    }
                }
            }
        }
        return null;
    }
}
