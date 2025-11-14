package j4;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941a extends C5.p {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f11912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0941a(b bVar) {
        super(4);
        this.f11912c = bVar;
    }

    @Override // C5.p
    public final int j(int i4) {
        k kVar = (k) this.f11912c.g(i4);
        if ((kVar instanceof j) || (kVar instanceof h)) {
            return 2;
        }
        if (kVar instanceof g) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
