package L6;

import c7.AbstractC0586e;
import c7.C0584c;
import g6.C0790b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: L6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0132o {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0132o f3152e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0132o f3153f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0132o[] f3154g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C0790b f3155h;

    /* renamed from: d, reason: collision with root package name */
    public final M6.h f3156d;

    static {
        EnumC0132o enumC0132o = new EnumC0132o("CLASS", 0, 0);
        EnumC0132o enumC0132o2 = new EnumC0132o("INTERFACE", 1, 1);
        EnumC0132o enumC0132o3 = new EnumC0132o("ENUM_CLASS", 2, 2);
        EnumC0132o enumC0132o4 = new EnumC0132o("ENUM_ENTRY", 3, 3);
        EnumC0132o enumC0132o5 = new EnumC0132o("ANNOTATION_CLASS", 4, 4);
        EnumC0132o enumC0132o6 = new EnumC0132o("OBJECT", 5, 5);
        f3152e = enumC0132o6;
        EnumC0132o enumC0132o7 = new EnumC0132o("COMPANION_OBJECT", 6, 6);
        f3153f = enumC0132o7;
        EnumC0132o[] enumC0132oArr = {enumC0132o, enumC0132o2, enumC0132o3, enumC0132o4, enumC0132o5, enumC0132o6, enumC0132o7};
        f3154g = enumC0132oArr;
        f3155h = new C0790b(enumC0132oArr);
    }

    public EnumC0132o(String str, int i4, int i8) {
        C0584c c0584c = AbstractC0586e.f9702f;
        o6.j.d(c0584c, "CLASS_KIND");
        this.f3156d = new M6.h(c0584c, i8);
    }

    public static EnumC0132o valueOf(String str) {
        return (EnumC0132o) Enum.valueOf(EnumC0132o.class, str);
    }

    public static EnumC0132o[] values() {
        return (EnumC0132o[]) f3154g.clone();
    }
}
