package C7;

import f7.C0725e;
import java.util.Arrays;
import java.util.Collection;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final C0725e f803a;

    /* renamed from: b, reason: collision with root package name */
    public final I7.k f804b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f805c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1163b f806d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f807e;

    public i(C0725e c0725e, I7.k kVar, Collection collection, InterfaceC1163b interfaceC1163b, e... eVarArr) {
        this.f803a = c0725e;
        this.f804b = kVar;
        this.f805c = collection;
        this.f806d = interfaceC1163b;
        this.f807e = eVarArr;
    }

    public /* synthetic */ i(C0725e c0725e, e[] eVarArr) {
        this(c0725e, eVarArr, h.f795e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(C0725e c0725e, e[] eVarArr, InterfaceC1163b interfaceC1163b) {
        this(c0725e, null, null, interfaceC1163b, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        o6.j.e(c0725e, "name");
    }

    public /* synthetic */ i(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, h.f797g);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Collection collection, e[] eVarArr, InterfaceC1163b interfaceC1163b) {
        this(null, null, collection, interfaceC1163b, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        o6.j.e(collection, "nameList");
    }
}
