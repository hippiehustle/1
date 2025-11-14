package h7;

import a6.AbstractC0434i;
import a6.AbstractC0436k;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: h7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0846i {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* renamed from: e, reason: collision with root package name */
    public static final Set f11451e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f11452f;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11466d;

    static {
        EnumC0846i[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC0846i enumC0846i : values) {
            if (enumC0846i.f11466d) {
                arrayList.add(enumC0846i);
            }
        }
        f11451e = AbstractC0436k.V0(arrayList);
        f11452f = AbstractC0434i.l1(values());
    }

    EnumC0846i(boolean z8) {
        this.f11466d = z8;
    }
}
