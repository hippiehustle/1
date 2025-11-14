package f5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import t.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f10773a = new j(0);

    /* renamed from: b, reason: collision with root package name */
    public final j f10774b = new j(0);

    public static e a(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            return b(context, resourceId);
        }
        return null;
    }

    public static e b(Context context, int i4) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i4);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e9) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i4), e9);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [f5.f, java.lang.Object] */
    public static e c(ArrayList arrayList) {
        e eVar = new e();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                eVar.f10774b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = AbstractC0710a.f10768c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = AbstractC0710a.f10769d;
                    }
                } else {
                    interpolator = AbstractC0710a.f10767b;
                }
                ?? obj = new Object();
                obj.f10778d = 0;
                obj.f10779e = 1;
                obj.f10775a = startDelay;
                obj.f10776b = duration;
                obj.f10777c = interpolator;
                obj.f10778d = objectAnimator.getRepeatCount();
                obj.f10779e = objectAnimator.getRepeatMode();
                eVar.f10773a.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return eVar;
    }

    public final f d(String str) {
        j jVar = this.f10773a;
        if (jVar.get(str) != null) {
            return (f) jVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f10773a.equals(((e) obj).f10773a);
    }

    public final int hashCode() {
        return this.f10773a.hashCode();
    }

    public final String toString() {
        return "\n" + e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f10773a + "}\n";
    }
}
