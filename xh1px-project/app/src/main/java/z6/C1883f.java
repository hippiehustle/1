package z6;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import n6.InterfaceC1162a;
import w7.z;

/* renamed from: z6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f16711e;

    public /* synthetic */ C1883f(h hVar, int i4) {
        this.f16710d = i4;
        this.f16711e = hVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4 = this.f16710d;
        h hVar = this.f16711e;
        switch (i4) {
            case 0:
                return Arrays.asList(hVar.l().U(n.k), hVar.l().U(n.f16803m), hVar.l().U(n.f16804n), hVar.l().U(n.f16802l));
            default:
                EnumMap enumMap = new EnumMap(j.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (j jVar : j.values()) {
                    String b4 = jVar.f16729d.b();
                    if (b4 != null) {
                        z l6 = hVar.k(b4).l();
                        if (l6 != null) {
                            String b9 = jVar.f16730e.b();
                            if (b9 != null) {
                                z l8 = hVar.k(b9).l();
                                if (l8 != null) {
                                    enumMap.put((EnumMap) jVar, (j) l8);
                                    hashMap.put(l6, l8);
                                    hashMap2.put(l8, l6);
                                } else {
                                    h.a(48);
                                    throw null;
                                }
                            } else {
                                h.a(47);
                                throw null;
                            }
                        } else {
                            h.a(48);
                            throw null;
                        }
                    } else {
                        h.a(47);
                        throw null;
                    }
                }
                return new g(enumMap, hashMap, hashMap2);
        }
    }
}
