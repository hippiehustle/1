package n0;

/* renamed from: n0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112B extends C1116F {

    /* renamed from: s, reason: collision with root package name */
    public final Class f12718s;

    public C1112B(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f12718s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // n0.C1116F, n0.AbstractC1117G
    public final String b() {
        return this.f12718s.getName();
    }

    @Override // n0.C1116F
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        boolean equalsIgnoreCase;
        o6.j.e(str, "value");
        Class cls = this.f12718s;
        Object[] enumConstants = cls.getEnumConstants();
        o6.j.d(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                obj = enumConstants[i4];
                String name = ((Enum) obj).name();
                if (name == null) {
                    if (str == null) {
                        equalsIgnoreCase = true;
                    } else {
                        equalsIgnoreCase = false;
                    }
                } else {
                    equalsIgnoreCase = name.equalsIgnoreCase(str);
                }
                if (equalsIgnoreCase) {
                    break;
                }
                i4++;
            } else {
                obj = null;
                break;
            }
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder s8 = A.j.s("Enum value ", str, " not found for type ");
        s8.append(cls.getName());
        s8.append('.');
        throw new IllegalArgumentException(s8.toString());
    }
}
