package y7;

import java.util.Arrays;
import java.util.List;
import p7.InterfaceC1333o;
import w7.AbstractC1759v;
import w7.G;
import w7.J;
import w7.W;
import w7.z;
import x7.C1824f;

/* loaded from: classes.dex */
public final class i extends z {

    /* renamed from: e, reason: collision with root package name */
    public final J f16529e;

    /* renamed from: f, reason: collision with root package name */
    public final g f16530f;

    /* renamed from: g, reason: collision with root package name */
    public final k f16531g;

    /* renamed from: h, reason: collision with root package name */
    public final List f16532h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16533i;
    public final String[] j;
    public final String k;

    public i(J j, g gVar, k kVar, List list, boolean z8, String... strArr) {
        o6.j.e(kVar, "kind");
        o6.j.e(list, "arguments");
        o6.j.e(strArr, "formatParams");
        this.f16529e = j;
        this.f16530f = gVar;
        this.f16531g = kVar;
        this.f16532h = list;
        this.f16533i = z8;
        this.j = strArr;
        String str = kVar.f16565d;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.k = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // w7.AbstractC1759v
    public final J B0() {
        return this.f16529e;
    }

    @Override // w7.AbstractC1759v
    public final boolean E0() {
        return this.f16533i;
    }

    @Override // w7.AbstractC1759v
    /* renamed from: G0 */
    public final AbstractC1759v J0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        return this;
    }

    @Override // w7.W
    /* renamed from: J0 */
    public final W G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        return this;
    }

    @Override // w7.z, w7.W
    public final W K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return this;
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        String[] strArr = this.j;
        return new i(this.f16529e, this.f16530f, this.f16531g, this.f16532h, z8, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return this;
    }

    @Override // w7.AbstractC1759v
    public final List r0() {
        return this.f16532h;
    }

    @Override // w7.AbstractC1759v
    public final InterfaceC1333o w0() {
        return this.f16530f;
    }

    @Override // w7.AbstractC1759v
    public final G y0() {
        G.f15953e.getClass();
        return G.f15954f;
    }
}
