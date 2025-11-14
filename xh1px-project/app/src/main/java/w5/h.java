package w5;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f15744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l lVar, int i4) {
        super(lVar);
        this.f15743e = i4;
        this.f15744f = lVar;
    }

    @Override // w5.i
    public final float a() {
        float f8;
        float f9;
        switch (this.f15743e) {
            case 0:
                l lVar = this.f15744f;
                f8 = lVar.f15767h;
                f9 = lVar.f15768i;
                break;
            case 1:
                l lVar2 = this.f15744f;
                f8 = lVar2.f15767h;
                f9 = lVar2.j;
                break;
            default:
                return this.f15744f.f15767h;
        }
        return f8 + f9;
    }
}
