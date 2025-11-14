package R;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B1.b f4982a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, B1.b bVar) {
        super(inputConnection, false);
        this.f4982a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        W0.c cVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            cVar = new W0.c(14, new f(inputContentInfo));
        }
        if (this.f4982a.b(cVar, i4, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i4, bundle);
    }
}
