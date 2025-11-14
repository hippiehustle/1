package L5;

import com.google.android.material.internal.CheckableImageButton;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i4) {
        super(nVar);
        this.f2945e = i4;
    }

    @Override // L5.o
    public void r() {
        switch (this.f2945e) {
            case 0:
                n nVar = this.f2991b;
                nVar.f2982r = null;
                CheckableImageButton checkableImageButton = nVar.j;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC1638C.K(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
