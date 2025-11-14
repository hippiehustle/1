package L0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f2747a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2748b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2749c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f2747a = eVar;
        this.f2748b = eVar2;
        this.f2749c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f2749c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            eVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        e eVar = this.f2747a;
        Method method = (Method) eVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            eVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f2748b;
        Method method = (Method) eVar.get(name);
        if (method == null) {
            Class b4 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b4.getDeclaredMethod("write", cls, a.class);
            eVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i4);

    public final Parcelable f(Parcelable parcelable, int i4) {
        if (!e(i4)) {
            return parcelable;
        }
        return ((b) this).f2751e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f2751e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void h(int i4);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f2751e.writeString(null);
            return;
        }
        try {
            ((b) this).f2751e.writeString(b(cVar.getClass()).getName());
            b a3 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a3);
                Parcel parcel = a3.f2751e;
                int i4 = a3.f2755i;
                if (i4 >= 0) {
                    int i8 = a3.f2750d.get(i4);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (e12.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e12.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
