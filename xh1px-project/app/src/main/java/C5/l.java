package C5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f692b;

    public /* synthetic */ l(m mVar, int i4) {
        this.f691a = i4;
        this.f692b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f691a) {
            case 1:
                super.onAnimationEnd(animator);
                m mVar = this.f692b;
                m.a(mVar);
                ArrayList arrayList = mVar.f699i;
                if (arrayList != null && !mVar.j) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(mVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f691a) {
            case 0:
                super.onAnimationStart(animator);
                m mVar = this.f692b;
                ArrayList arrayList = mVar.f699i;
                if (arrayList != null && !mVar.j) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).b(mVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
