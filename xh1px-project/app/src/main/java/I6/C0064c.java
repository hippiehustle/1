package I6;

import a6.AbstractC0434i;
import f7.C0725e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import n6.InterfaceC1163b;

/* renamed from: I6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064c implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0064c f2187e = new C0064c(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C0064c f2188f = new C0064c(1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0064c f2189g = new C0064c(2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0064c f2190h = new C0064c(3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2191d;

    public /* synthetic */ C0064c(int i4) {
        this.f2191d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        switch (this.f2191d) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = AbstractC0065d.f2192a;
                o6.j.e(parameterizedType, "it");
                Type ownerType = parameterizedType.getOwnerType();
                if (!(ownerType instanceof ParameterizedType)) {
                    return null;
                }
                return (ParameterizedType) ownerType;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = AbstractC0065d.f2192a;
                o6.j.e(parameterizedType2, "it");
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                o6.j.d(actualTypeArguments, "getActualTypeArguments(...)");
                return AbstractC0434i.L0(actualTypeArguments);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (((Class) obj).getSimpleName().length() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!C0725e.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName == null) {
                    return null;
                }
                return C0725e.e(simpleName);
        }
    }
}
