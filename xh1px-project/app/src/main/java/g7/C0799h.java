package g7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11235b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map f11236a;

    static {
        new C0799h(0);
    }

    public C0799h() {
        this.f11236a = new HashMap();
    }

    public final void a(n nVar) {
        this.f11236a.put(new C0798g(nVar.f11250d.f11244d, nVar.f11247a), nVar);
    }

    public C0799h(int i4) {
        this.f11236a = Collections.EMPTY_MAP;
    }
}
