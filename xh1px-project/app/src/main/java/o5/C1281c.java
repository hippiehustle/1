package o5;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: o5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281c {

    /* renamed from: a, reason: collision with root package name */
    public final int f13618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f13620c;

    public C1281c(int i4) {
        this.f13618a = i4;
    }

    public final int a() {
        switch (this.f13619b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f13620c;
                if (carouselLayoutManager.J0()) {
                    return carouselLayoutManager.f14821n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1281c(CarouselLayoutManager carouselLayoutManager, int i4) {
        this(1);
        this.f13619b = i4;
        switch (i4) {
            case 1:
                this.f13620c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f13620c = carouselLayoutManager;
                return;
        }
    }
}
