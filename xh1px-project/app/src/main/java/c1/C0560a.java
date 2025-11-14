package c1;

import R3.r;
import X6.q;
import d5.InterfaceC0609a;
import h4.InterfaceC0827a;
import h4.InterfaceC0829c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import y3.InterfaceC1835d;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560a implements InterfaceC1835d, InterfaceC0827a, InterfaceC0829c, O4.h, U4.c, InterfaceC0609a, U5.a, V5.g, X5.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f9433a;

    /* renamed from: b, reason: collision with root package name */
    public final C0562c f9434b;

    /* renamed from: c, reason: collision with root package name */
    public final C0560a f9435c = this;

    public C0560a(h hVar, C0562c c0562c) {
        this.f9433a = hVar;
        this.f9434b = c0562c;
    }

    public final r a() {
        Map unmodifiableMap;
        q qVar = new q(1);
        Boolean bool = Boolean.TRUE;
        LinkedHashMap linkedHashMap = qVar.f7033a;
        linkedHashMap.put("c3.j", bool);
        linkedHashMap.put("b5.h", bool);
        linkedHashMap.put("M1.l", bool);
        linkedHashMap.put("y3.g", bool);
        linkedHashMap.put("h4.e", bool);
        linkedHashMap.put("Y4.i", bool);
        linkedHashMap.put("V4.q", bool);
        linkedHashMap.put("W4.x", bool);
        linkedHashMap.put("c5.a", bool);
        linkedHashMap.put("d5.r", bool);
        linkedHashMap.put("Q4.t", bool);
        linkedHashMap.put("R4.i", bool);
        linkedHashMap.put("O4.l", bool);
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        }
        Y5.b bVar = new Y5.b(unmodifiableMap);
        C0562c c0562c = this.f9434b;
        return new r(bVar, 4, new r(this.f9433a, 11, c0562c));
    }
}
