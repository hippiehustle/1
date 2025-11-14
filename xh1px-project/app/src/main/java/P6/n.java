package P6;

import a6.AbstractC0437l;
import f7.C0723c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4571a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4572b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f4573c;

    static {
        EnumC0278a enumC0278a = EnumC0278a.f4547i;
        EnumC0278a enumC0278a2 = EnumC0278a.f4546h;
        EnumC0278a enumC0278a3 = EnumC0278a.f4545g;
        EnumC0278a enumC0278a4 = EnumC0278a.f4543e;
        EnumC0278a enumC0278a5 = EnumC0278a.f4544f;
        List X8 = AbstractC0437l.X(enumC0278a3, enumC0278a4, enumC0278a5, enumC0278a, enumC0278a2);
        List y4 = E2.d.y(enumC0278a5);
        C0723c c0723c = x.f4612a;
        X6.h hVar = X6.h.f7006f;
        Map P02 = a6.x.P0(new Z5.j(c0723c, new m(new X6.i(hVar), X8, false)), new Z5.j(x.f4613b, new m(new X6.i(hVar), X8, false)), new Z5.j(x.f4614c, new m(new X6.i(X6.h.f7004d), X8)));
        f4571a = P02;
        Map P03 = a6.x.P0(new Z5.j(x.f4619h, new m(new X6.i(hVar), y4)), new Z5.j(x.f4620i, new m(new X6.i(X6.h.f7005e), y4)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(P02);
        linkedHashMap.putAll(P03);
        f4573c = linkedHashMap;
    }
}
